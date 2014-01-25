package com.nflabs.zeppelin.driver;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import com.nflabs.zeppelin.conf.ZeppelinConfiguration;
import com.nflabs.zeppelin.driver.ZeppelinConnection;
import com.nflabs.zeppelin.driver.ZeppelinDriver;
import com.nflabs.zeppelin.driver.ZeppelinDriverException;
import com.nflabs.zeppelin.result.Result;

public class TestDriver extends ZeppelinDriver{
	static public Map<String, Result> queries = new HashMap<String, Result>();
	public Map<String, Result> views = new HashMap<String, Result>();
	public Map<String, Result> tables = new HashMap<String, Result>();
	
	public TestDriver(ZeppelinConfiguration conf, URI uri) {
		super(conf, uri);
	}

	@Override
	public ZeppelinConnection getConnection() throws ZeppelinDriverException {
		return new TestDriverConnection(queries, views, tables);
	}

	@Override
	public void init() throws ZeppelinDriverException {
	}

	@Override
	public void destroy() throws ZeppelinDriverException {
	}

	
}
