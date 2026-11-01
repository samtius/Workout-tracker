# Workout Tracker – Project Plan

## 1. Project Overview

Workout Tracker is a full-stack web application designed to help users log workouts, track exercises, and monitor their progress over time.

The project is also intended as a learning experience in modern software development, covering backend development, databases, frontend development, testing, version control, and deployment.

## 2. Main Goals

- Build a functional workout tracking application.
- Learn Java and Spring Boot for backend development.
- Gain experience with PostgreSQL and database design.
- Learn React and TypeScript for frontend development.
- Practice Git, GitHub Issues, branches, and pull requests.
- Build a responsive application usable on mobile devices.
- Publish a working application as part of a developer portfolio.

## 3. Minimum Viable Product (MVP)

The first version should allow users to:

- Create and view exercises.
- Register workouts with dates and exercises.
- Record sets, repetitions, and weights.
- View previous workouts.
- Edit and delete workout records.

## 4. Planned Technology Stack

- Backend: Java, Spring Boot
- Database: PostgreSQL
- Frontend: React, TypeScript
- Version Control: Git, GitHub
- Testing: JUnit, integration tests
- Deployment: Docker, cloud hosting

## 5. Future Features

- User authentication
- Progress charts and statistics
- Workout templates
- Progressive Web App (PWA)
- AI-assisted training insights

## 6. Development Workflow

Each feature will be tracked using GitHub Issues.

Development will take place on separate branches, with changes reviewed and merged into `main` through pull requests.

Documentation and automated tests will be added throughout development.

The goal is to understand and implement the core functionality independently, using AI primarily for learning, code review, and assistance.

### Workout Creation – MVP

Users will initially create workouts manually by selecting exercises and recording sets, repetitions, and weights.

Each workout will have a date and may contain multiple exercises. Each exercise can contain multiple sets with individual weights and repetition counts.

Completed workouts will be saved and accessible through workout history.

### Exercise Management – MVP

The application will provide a predefined library of common gym exercises.

Users will be able to:
- Browse and search predefined exercises.
- Select exercises when creating a workout.
- Create custom exercises.
- Reuse previously created custom exercises.
- Edit their custom exercises.

Predefined exercises cannot be modified by regular users.

Custom exercises will be stored in the database. The application should preserve workout history when exercises are edited or removed.

### Future Enhancement – Workout Programs

Users will be able to create reusable workout templates with predefined exercises and planned sets.

A training program will contain multiple workout templates. Users will be able to start a workout from a template and record their actual performance without changing the original template or previous workout history.
