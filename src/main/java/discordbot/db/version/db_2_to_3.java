package discordbot.db.version;

import discordbot.db.IDbVersion;

public class db_2_to_3 implements IDbVersion {
	@Override
	public int getFromVersion() {
		return 2;
	}

	@Override
	public int getToVersion() {
		return 3;
	}

	@Override
	public String[] getExecutes() {
		return new String[]{
				"ALTER TABLE playlist MODIFY filename VARCHAR(255) NOT NULL"
		};
	}
}