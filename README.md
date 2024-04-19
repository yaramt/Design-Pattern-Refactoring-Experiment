# ML4SE Experiment: Utilizing Large Language Models for Code Refactoring

This repository contains the materials and findings from an experiment conducted for the ML4SE course, exploring the use of Large Language Models (LLMs) as assistant tools for aiding Software Engineers in code refactoring from one design pattern to another.

## Experiment Overview

The experiment involved computer scientists with varying levels of experience. Participants were assigned two tasks:

1. **Task 1**: Independently refactor a patternless e-commerce application into a Model-View-Controller (MVC) structure using only the provided cheat sheet on the MVC design pattern.

2. **Task 2**: Independently refactor the application, already in MVC format, into a Hierarchical Model-View-Controller (HMVC) format using the provided HMVC cheat sheet. Following this, participants were provided with instructions generated by ChatGPT on how to accomplish the same task. They were then asked to provide feedback on the helpfulness of these instructions.

## Folder Structure

- `app/`: Contains patternless, MVC, HMVC source code used in the experiment as a groundtruth.
- `Prompts/`: Contains answers ChatGPT generated for task 1 and 2.
- `Data/`: Contains data collected after running the experiment.
