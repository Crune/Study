package test.struts;

import java.io.File;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	
	private Log log = LogFactory.getLog(UploadAction.class);
	
	private String writer;

	private File[] save;  // 임시파일
	private String[] saveContentType; // 파일형식
	private String[] saveFileName; // 파일명

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public void setSaveFileName(String[] saveFileName) {
		this.saveFileName = saveFileName;
	}
	public void setSave(File[] save) {
		this.save = save;
	}
	public void setSaveContentType(String[] saveContentType) {
		this.saveContentType = saveContentType;
	}

	public String execute() throws Exception {
		if (save.length > 0) {
			Set<Integer> randSet = new HashSet<Integer>();
			while (true) {
				if (randSet.size() >= save.length)
					break;
				randSet.add((int) (Math.random()*1000));
			}
			int cur = 0;
			for (Integer i : randSet) {
				Date d = new Date(System.currentTimeMillis());
				int rand = i;
				String date = d.toString().replace(":", "").replace(" ", "-");
				String fName = "f:/save/" + writer+"_" +date+"_"+rand+"_" +saveFileName[cur];
				File copy = new File(fName);
				FileUtils.copyFile(save[cur++], copy);
			}
		}

		return "success";
	}

}
