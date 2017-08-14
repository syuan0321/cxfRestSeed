package com.tci.derek.tcxfRestServer.dao;

public class DBAccess {

	protected String name = null;

/*	@Autowired 
	protected DataSource dl4DataSource = null;
	public void setDataSource(DataSource dataSource) {
		this.dl4DataSource = dataSource;
	}

	public DataSource getDataSource() {
		return dl4DataSource;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	public String getName() {
		if ( name != null )
			return name;
		else
			return this.getClass().getSimpleName();
	}
}
