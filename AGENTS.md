# AGENTS.md - Calc02 Project Guide

## Project Overview
Simple CLI calculator application in Java. Two-class architecture: `Calculo` (data model) and `Main` (controller/CLI). No external dependencies, uses built-in Java utilities.

## Architecture & Key Components

### `Calculo.java` - Data Model
- Holds calculator state: two operands (`numero`, `numero2`) and operation string (`operacao`)
- Pure POJO with getter/setter methods
- **Pattern**: Direct field access via getters, no validation logic
- Simple initialization with default values (0 for numbers, empty string for operation)

### `Main.java` - CLI Controller & Executor
- Infinite loop (`while(true)`) for continuous calculator interaction
- **Input flow**: Prompt user → collect values via `Scanner.nextDouble()` / `Scanner.next()` → perform calculation
- **Calculation pattern**: Switch expression with arrow syntax (Java 14+) directly computes results
- **Division by zero**: Special case check before operation
- Single responsibility: input prompt + calculation dispatch

## Build & Execution

### Project Structure
- IntelliJ IDEA project (`Calc02.iml`)
- Source: `src/` directory
- Compiled output: `out/` directory (IntelliJ standard)
- **Compile**: Use IntelliJ Build menu or javac
- **Run**: IDE run configuration or `java -cp out/production/Calc02 Main`

### Language & Features
- Java version: Uses modern syntax (switch expressions), likely Java 14+
- No build tool (Maven/Gradle) - simple classpath compilation

## Developer Conventions

### Input/Output
- **Language**: Portuguese comments and terminal prompts (UI entirely in Portuguese)
- **CLI**: Text-based with numbered menu style (`===Calculadora===`)
- **Input**: Expects user to enter values sequentially (num1 → operation → num2)

### Code Style
- Variables: camelCase for instance variables/getters/setters
- Comments: Portuguese, descriptive ("// Terminal teste", "// switchcase operacao", "// Variaveis", "// Gets e Sets")
- Spacing: Intentional blank lines between logical sections (fields, methods, comment blocks)

### Calculation Logic
- **Direct computation**: No separate calculation method in `Calculo` class - logic lives in `Main`
- **Operations supported**: `+`, `-`, `*`, `/` only
- **Error handling**: Division by zero prevention (`if (numero2 == 0)`) is explicit, no exceptions thrown
- **Result handling**: Print to stdout immediately after calculation

## Extension Points & Common Tasks

### Adding New Operations
1. Add case to switch statement in `Main.java` (line 21-42)
2. No validation or refactoring needed in `Calculo.java` - it only stores state
3. Follow existing pattern: compute result → print output

### Improving Error Handling
- Currently: D ZeroDivisionError handled silently with message
- Could: Throw exception, add input validation for non-numeric inputs, handle invalid operations

### Refactoring Opportunities
- `Calculo` class could gain a `calculate()` method to encapsulate logic
- `Main` could extract calculation logic into separate method
- `Scanner` resource management: No `close()` call (minor resource leak)

## Testing & Debugging
- No test files present
- Manual CLI testing approach
- IntelliJ debugging: Set breakpoints in `Main.java` to inspect `Calculo` object state during execution

