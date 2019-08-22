package com.pqlUtils;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public abstract class PqlService {
	public static List<String> defaultCommands(){
	List<String> commandList = new ArrayList<String>();
	commandList.add("cmd.exe");
	commandList.add("/c");
	commandList.add("cd \\\"C:\\\\Program Files\\\\PPTOddsOracle\\\\ui_jar\\");
	commandList.add("java -cp p2.jar propokertools.cli.RunPQL \"select avg(riverEquity(p1)) from game='holdem', p1='AK', p2='JT'\"");
	System.out.println("static method default Commands executed");
	return commandList;
	
	}
//	ProcessBuilder builder = new ProcessBuilder(
//            "cmd.exe", "/c", "cd \"C:\\Program Files\\PPTOddsOracle\\ui_jar\" && java -cp p2.jar propokertools.cli.RunPQL \"select avg(riverEquity(p1)) from game='holdem', p1='AK', p2='JT'\"");
//        builder.redirectErrorStream(true);
//        Process p = builder.start();
//        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
//        String line;
//        while (true) {
//            line = r.readLine();
//            if (line == null) { break; }
//            System.out.println(line);
//        }
    }

