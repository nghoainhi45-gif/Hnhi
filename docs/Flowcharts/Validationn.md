```mermaid
flowchart TD
    %% isValidId
    A1[Start isValidId] --> B1{ID null or empty?}
    B1 -- Yes --> C1[Return false]
    B1 -- No --> D1{Contains space?}
    D1 -- Yes --> C1
    D1 -- No --> E1[Return true]

    %% isValidAge
    A2[Start isValidAge] --> B2{Age >= 18 OR Age <= 65?}
    B2 -- Yes --> C2[Return true]
    B2 -- No --> D2[Return false]

    %% isValidSalary
    A3[Start isValidSalary] --> B3{Salary >= 0?}
    B3 -- Yes --> C3[Return true]
    B3 -- No --> D3[Return false]

    %% isValidName
    A4[Start isValidName] --> B4{Name null?}
    B4 -- Yes --> C4[Return false]
    B4 -- No --> D4[Trim name]
    D4 --> E4{Length >= 1?}
    E4 -- Yes --> F4[Return true]
    E4 -- No --> C4

    %% isValidEmail
    A5[Start isValidEmail] --> B5{Email null or empty?}
    B5 -- Yes --> C5[Return false]
    B5 -- No --> D5[Trim email]
    D5 --> E5{"Matches email pattern?"}
    E5 -- Yes --> F5[Return true]
    E5 -- No --> C5

    %% isValidPhone
    A6[Start isValidPhone] --> B6{Phone null?}
    B6 -- Yes --> C6[Return false]
    B6 -- No --> D6[Trim phone]
    D6 --> E6{"Matches 10 digits?"}
    E6 -- Yes --> F6[Return true]
    E6 -- No --> C6

