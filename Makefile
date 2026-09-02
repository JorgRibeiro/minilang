ANTLR := /usr/bin/antlr4
ANTLR_JAR := /usr/share/java/antlr-4.13.2-complete.jar

GRAMMAR := MiniLang
GRAMMAR_FILE := $(GRAMMAR).g4
START_RULE := programa

BUILD_DIR := .antlr
FILE ?= exemplo.txt

.PHONY: all generate compile test tokens gui validate clean

all: compile

generate:
	rm -rf $(BUILD_DIR)
	mkdir -p $(BUILD_DIR)
	$(ANTLR) -Dlanguage=Java -no-listener -o $(BUILD_DIR) $(GRAMMAR_FILE)

compile: generate
	javac -cp "$(ANTLR_JAR)" -d $(BUILD_DIR) $(BUILD_DIR)/*.java
	javac -cp "$(ANTLR_JAR):$(BUILD_DIR)" -d $(BUILD_DIR) src/Main.java

test: compile
	java -cp "$(ANTLR_JAR):$(BUILD_DIR)" org.antlr.v4.gui.TestRig \
		$(GRAMMAR) $(START_RULE) -tree < "$(FILE)"

tokens: compile
	java -cp "$(ANTLR_JAR):$(BUILD_DIR)" org.antlr.v4.gui.TestRig \
		$(GRAMMAR) $(START_RULE) -tokens < "$(FILE)"

gui: compile
	java -cp "$(ANTLR_JAR):$(BUILD_DIR)" org.antlr.v4.gui.TestRig \
		$(GRAMMAR) $(START_RULE) -gui < "$(FILE)"

validate: compile
	java -cp "$(ANTLR_JAR):$(BUILD_DIR)" Main "$(FILE)"

clean:
	rm -rf $(BUILD_DIR)
