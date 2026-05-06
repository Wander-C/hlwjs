# Makefile

USER_NAME := $(shell git config user.name)
COMMIT_MSG ?= "Auto commit by $(USER_NAME)"

submit:
	git add .
	git commit -m '$(COMMIT_MSG)'
	git push

commit:
	git add .
	git commit -m '$(COMMIT_MSG)'