```mermaid
flowchart TD
    %% ================= isValidId =================
    A1[Start isValidId] --> B1{ID null or empty?}
    B1 -- Yes --> C1[Return false]
    B1 -- No --> D1{Contains space?}
    D1 -- Yes --> C1
    D1 -- No --> E1[Return true]

    %% ================= isValidName =================
    A2[Start isValidName] --> B2{Name null?}
    B2 -- Yes --> C2[Return false]
    B2 -- No --> D2{Name trim length < 1?}
    D2 -- Yes --> C2
    D2 -- No --> E2[Return true]

    %% ================= isValidAge =================
    A3[Start isValidAge] --> B3{Age >=18 AND <=65?}
    B3 -- Yes --> C3[Return true]
    B3 -- No --> D3[Return false]

    %% ================= isValidSalary =================
    A4[Start isValidSalary] --> B4{Salary >=0?}
    B4 -- Yes --> C4[Return true]
    B4 -- No --> D4[Return false]

    %% ================= isValidEmail =================
    A5[Start isValidEmail] --> B5{Email null or empty?}
    B5 -- Yes --> C5[Return false]
    B5 -- No --> D5{Matches regex?}
    D5 -- Yes --> E5[Return true]
    D5 -- No --> C5

    %% ================= isValidPhone =================
    A6[Start isValidPhone] --> B6{Phone null?}
    B6 -- Yes --> C6[Return false]
    B6 -- No --> D6{Matches 10 digits?}
    D6 -- Yes --> E6[Return true]
    D6 -- No --> C6

    %% ================= isValidDepartment =================
    A7[Start isValidDepartment] --> B7{Department null or empty?}
    B7 -- Yes --> C7[Return false]
    B7 -- No --> D7{Contains space?}
    D7 -- Yes --> C7
    D7 -- No --> E7[Return true]

    %% ================= isValidPosition =================
    A8[Start isValidPosition] --> B8{posnId null or empty?}
    B8 -- Yes --> C8[Return false]
    B8 -- No --> D8{posnId contains space?}
    D8 -- Yes --> C8
    D8 -- No --> E8{posnName null or empty?}
    E8 -- Yes --> C8
    E8 -- No --> F8{posnName length < 2?}
    F8 -- Yes --> C8
    F8 -- No --> G8[Return true]

    P -- No --> R{Email valid?}
    R -- No --> Q
    R -- Yes --> S[Enter Phone]
    S --> T{Phone invalid?}
    T -- Yes --> U[Error, retry Phone]
    T -- No --> V[All valid → Save → End]



