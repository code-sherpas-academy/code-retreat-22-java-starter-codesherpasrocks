package gradle.java.latest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class CommandExecutorTest {

  @Test
  void executeSingleCommand(){
    //ARRANGE
    String inputCommand = "F";
    Command command = Command.FORWARD;
    CommandInterpreter commandInterpreter = mock(CommandInterpreter.class);
    when(commandInterpreter.parse(inputCommand)).thenReturn(command);

    Position position = new Position(1, 1, "NORTH");
    MarsRover marsRover = mock(MarsRover.class);
    when(marsRover.execute(command)).thenReturn(position);

    String expectedOutput = "1,1,NORTH";
    OutputFormatter outputFormatter = mock(OutputFormatter.class);
    when(outputFormatter.format(position)).thenReturn(expectedOutput);

    //ACT
    CommandExecutor commandExecutor = new CommandExecutor(commandInterpreter, marsRover, outputFormatter);
    String output = commandExecutor.execute(inputCommand);

    //ASSERT
    assertThat(output).isEqualTo(expectedOutput);
  }
}
