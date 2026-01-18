```mermaid
flowchart TD
    %% isValidId
    A1[Start isValidId] --> B1{ID null or empty?}
    B1 -- Yes --> C1[Return false]
    B1 -- No --> D1{Contains space?}
    D1 -- Yes --> C1
    D1 -- No --> E1[Return true]

    %% isValidName
    A2[Start isValidName] --> B2{Name null?}
    B2 -- Yes --> C2[Return false]
    B2 -- No --> D2[Trim name]
    D2 --> E2{Length >= 1?}
    E2 -- Yes --> F2[Return true]
    E2 -- No --> C2

    %% isValidAge
    A3[Start isValidAge] --> B3{18 <= Age <= 65?}
    B3 -- Yes --> C3[Return true]
    B3 -- No --> D3[Return false]

    %% isValidSalary
    A4[Start isValidSalary] --> B4{Salary >= 0?}
    B4 -- Yes --> C4[Return true]
    B4 -- No --> D4[Return false]

    %% isValidEmail
    A5[Start isValidEmail] --> B5{Email null or empty?}
    B5 -- Yes --> C5[Return false]
    B5 -- No --> D5[Trim email]
    D5 --> E5{Matches regex?}
    E5 -- Yes --> F5[Return true]
    E5 -- No --> C5

    %% isValidPhone
    A6[Start isValidPhone] --> B6{Phone null?}
    B6 -- Yes --> C6[Return false]
    B6 -- No --> D6[Trim phone]
    D6 --> E6{Matches 10 digits?}
    E6 -- Yes --> F6[Return true]
    E6 -- No --> C6
