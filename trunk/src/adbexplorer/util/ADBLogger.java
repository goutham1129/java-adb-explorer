/*
		Author : Ahmet DEMIR
		Version 1.0
		Date : May 2011
		Description : Java ADB Explorer allows you to explore your Anroid Phone.
		under License GPL: http://www.gnu.org/copyleft/gpl.html
		-----------------------------------------------------------
		Copyright (C) 2011 Ahmet DEMIR

 		This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

*/

package adbexplorer.util;

public class ADBLogger {

	private org.apache.log4j.Logger logger;
	
	@SuppressWarnings("rawtypes")
	public ADBLogger(Class classe) {
		logger = org.apache.log4j.Logger.getLogger(classe);
		 org.apache.log4j.PropertyConfigurator.configure(getClass().getResource("/lib/log4j.cfg"));
	}
	
	public void info(String message) {
		logger.info(message);
	}
	public void debug(String message) {
		logger.debug(message);
	}
	public void error(String message) {
		logger.error(message);
	}
	public void warn(String message) {
		logger.warn(message);
	}
	public void trace(String message) {
		logger.trace(message);
	}
	public void fatal(String message) {
		logger.fatal(message);
	}
	
	public void info(Exception e) {
		String log = "";
		log = e.toString() + "\n";
		StackTraceElement[] ste = new Throwable().getStackTrace();
		for(int i=0; i<ste.length; i++) {
			log += "at " + ste[i].toString()+ "\n";
		}	
		logger.info(log);
	}
	
	public void debug(Exception e) {
		String log = "";
		log = e.toString() + "\n";
		StackTraceElement[] ste = new Throwable().getStackTrace();
		for(int i=0; i<ste.length; i++) {
			log += "at " + ste[i].toString()+ "\n";
		}	
		logger.debug(log);
	}
	
	public void error(Exception e) {
		String log = "";
		log = e.toString() + "\n";
		StackTraceElement[] ste = new Throwable().getStackTrace();
		for(int i=0; i<ste.length; i++) {
			log += "at " + ste[i].toString()+ "\n";
		}	
		logger.error(log);
	}
	
	
	public void warn(Exception e) {
		String log = "";
		log = e.toString() + "\n";
		StackTraceElement[] ste = new Throwable().getStackTrace();
		for(int i=0; i<ste.length; i++) {
			log += "at " + ste[i].toString()+ "\n";
		}	
		logger.warn(log);
	}
	
	public void trace(Exception e) {
		String log = "";
		log = e.toString() + "\n";
		StackTraceElement[] ste = new Throwable().getStackTrace();
		for(int i=0; i<ste.length; i++) {
			log += "at " + ste[i].toString()+ "\n";
		}	
		logger.trace(log);
	}
	
	public void fatal(Exception e) {
		String log = "";
		log = e.toString() + "\n";
		StackTraceElement[] ste = new Throwable().getStackTrace();
		for(int i=0; i<ste.length; i++) {
			log += "at " + ste[i].toString()+ "\n";
		}	
		logger.fatal(log);
	}
	
	
}
