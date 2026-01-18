```mermaid
flowchart TD
    A[Start] --> B[Enter Employee ID]
    B --> C{ID null or empty?}
    C -- Yes --> D[Error, retry ID]
    C -- No --> E{ID contains space?}
    E -- Yes --> D
    E -- No --> F[Enter Name]
    F --> G{Name null or empty?}
    G -- Yes --> H[Error, retry Name]
    G -- No --> I[Enter Age]
    I --> J{Age <18 or >65?}
    J -- Yes --> K[Error, retry Age]
    J -- No --> L[Enter Salary]
    L --> M{Salary <0?}
    M -- Yes --> N[Error, retry Salary]
    M -- No --> O[Enter Email]
    O --> P{Email null or empty?}
    P -- Yes --> Q[Error, retry Email]
    P -- No --> R{Email valid?}
    R -- No --> Q
    R -- Yes --> S[Enter Phone]
    S --> T{Phone invalid?}
    T -- Yes --> U[Error, retry Phone]
    T -- No --> V[All valid → Save → End]

