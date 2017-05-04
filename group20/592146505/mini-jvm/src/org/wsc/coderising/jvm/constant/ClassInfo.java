package org.wsc.coderising.jvm.constant;

/**
 *
 * 类描述符
 * @author Administrator
 * @date 2017年4月9日下午2:45:38
 * @version v1.0
 *
 */
public class ClassInfo extends ConstantInfo {
	
	private int type = ConstantInfo.CLASS_INFO;
	private int utf8Index;

	public ClassInfo(ConstantPool pool) {
		super(pool);
	}

	public int getUtf8Index() {
		return utf8Index;
	}

	public void setUtf8Index(int utf8Index) {
		this.utf8Index = utf8Index;
	}

	public int getType() {
		return type;
	}

	public String getClassName() {
		int index = getUtf8Index();
		UTF8Info utf8Info = (UTF8Info) constantPool.getConstantInfo(index);
		return utf8Info.getValue();
	}
}
