## Database Relationships

```mermaid
erDiagram
    AppUser ||--o{ Workout : owns
    AppUser o|--o{ Exercise : creates
    MuscleGroup ||--o{ Exercise : categorizes
    Workout ||--o{ WorkoutExercise : contains
    Exercise ||--o{ WorkoutExercise : used_in
    WorkoutExercise ||--o{ WorkoutSet : contains
