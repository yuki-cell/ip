package duke.commands;

import duke.DukeException;
import duke.TaskList;
import duke.Ui;

public abstract class Command {

    public abstract String execute(String userInput, Ui ui, TaskList tasks, boolean isLoading) throws DukeException;

}
