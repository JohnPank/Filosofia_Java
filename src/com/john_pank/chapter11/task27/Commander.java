package com.john_pank.chapter11.task27;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Filosofia_Java
 * Created by John Pank on 19.07.2016.
 */

class Command{
    String command;
    Command(String command){
        this.command = command;
    }
    public void operation(){
        System.out.println(command);
    }
}

class QueueCreator{
    public Queue<Command> creation(){
        Queue<Command> queue = new LinkedList<>();
        queue.offer(new Command("stop"));
        queue.offer(new Command("to left"));
        queue.offer(new Command("forward"));
        queue.offer(new Command("forward"));
        queue.offer(new Command("stop"));
        queue.offer(new Command("to right"));
        queue.offer(new Command("back"));
        queue.offer(new Command("fire"));
        return queue;
    }
}

public class Commander {
    public static void main(String[] args) {
        Queue<Command> commands = new LinkedList<>();
        QueueCreator queueCreator = new QueueCreator();
        commands = queueCreator.creation();
        while (commands.peek() != null){
            commands.poll().operation();
        }
    }
}
