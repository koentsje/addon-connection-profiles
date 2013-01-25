package org.jboss.forge.database.tools.cp;

import java.util.ArrayList;
import java.util.List;

import org.jboss.forge.ui.UICompleter;

public class ConnectionProfileTypeCompleter implements UICompleter<String>{

	@Override
	public List<String> getCompletionProposals(String value) {
		ArrayList<String> result = new ArrayList<String>();
		for (String typeName : ConnectionProfileType.allTypes().keySet()) {
			if (typeName.startsWith(value)) {
				result.add(typeName);
			}
		}
		return result;
	}

}
