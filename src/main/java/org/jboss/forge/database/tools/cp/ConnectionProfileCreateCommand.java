package org.jboss.forge.database.tools.cp;

import org.jboss.forge.ui.Result;
import org.jboss.forge.ui.UICommand;
import org.jboss.forge.ui.UICommandID;
import org.jboss.forge.ui.UIContext;
import org.jboss.forge.ui.UIInput;
import org.jboss.forge.ui.UIValidationContext;
import org.jboss.forge.ui.base.SimpleUICommandID;

public class ConnectionProfileCreateCommand implements UICommand, ConnectionProfileConstants {

	private static final String COMMAND_NAME = 
			"org.jboss.forge.database.tools.cp.create";
	private static final String COMMAND_DESCRIPTION = 
			"Command to create a reusable database connection profile.";
	
	private UIInput<String> name;
	private UIInput<String> type;
	private UIInput<String> dialect;
	private UIInput<String> driver;
	private UIInput<String> pathToDriver;
	private UIInput<String> url;
	private UIInput<String> user;
	
	@Override
	public UICommandID getId() {
		return new SimpleUICommandID(COMMAND_NAME, COMMAND_DESCRIPTION);
	}

	@Override
	public void initializeUI(UIContext context) throws Exception {
		initializeNameInput(context);
		initializeTypeInput(context);
		initializeDialectInput(context);
		initializeDriverInput(context);
		initializePathToDriverInput(context);
		initializeUrlInput(context);
		initializeUserInput(context);
	}
	
	private void initializeNameInput(UIContext context) {
		name.setLabel(NAME);
//		name.setHelp(NAME_HELP);
		name.setRequired(true);
		context.getUIBuilder().add(name);
	}

	private void initializeTypeInput(UIContext context) {
		type.setLabel(TYPE);
//		type.setHelp(TYPE_HELP);
		type.setCompleter(new ConnectionProfileTypeCompleter());
		context.getUIBuilder().add(type);
	}

	private void initializeDialectInput(UIContext context) {
		dialect.setLabel(DIALECT);
//		dialect.setHelp(DIALECT_HELP);
		context.getUIBuilder().add(dialect);
	}

	private void initializeDriverInput(UIContext context) {
		driver.setLabel(DRIVER);
//		driver.setHelp(DRIVER_HELP);
		context.getUIBuilder().add(driver);
	}

	private void initializePathToDriverInput(UIContext context) {
		pathToDriver.setLabel(PATH_TO_DRIVER);
//		pathToDriver.setHelp(PATH_TO_DRIVER_HELP);
		context.getUIBuilder().add(pathToDriver);
	}

	private void initializeUrlInput(UIContext context) {
		url.setLabel(URL);
//		url.setHelp(URL_HELP);
		context.getUIBuilder().add(url);
	}

	private void initializeUserInput(UIContext context) {
		user.setLabel(USER);
//		user.setHelp(USER_HELP);
		context.getUIBuilder().add(user);
	}

	@Override
	public void validate(UIValidationContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Result execute(UIContext context) throws Exception {
		System.out.println("executing ConnectionProfileCreateCommand");
		return Result.success();
	}

}
