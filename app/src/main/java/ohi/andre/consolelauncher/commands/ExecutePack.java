package ohi.andre.consolelauncher.commands;

import java.util.Objects;

@SuppressWarnings("deprecation")
public abstract class ExecutePack {

    public Object[] args;

    public CommandGroup commandGroup;


    public ExecutePack(CommandGroup group) {
        this.commandGroup = group;
    }


    @SuppressWarnings("unchecked")
    public <T> T get(Class<T> c, int index) {
        if (index >= this.args.length)
            return null;

        return (T) (this.args[index]);
    }

    public void set(Object[] args) {
        this.args = args;
    }

    public void clear() {
        args = null;
    }
}
