package org.eop.fastdfs;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;

/**
 * @author lixinjie
 * @since 
 */
public class UploadFile {

	public static void main(String[] args) throws Exception {
		ClientGlobal.init("fdfs_client.conf");
		StorageClient1 sc = new StorageClient1();
		String[] ra = sc.upload_file("C:\\person\\work\\java\\openproject\\workspace\\fastdfs\\pom.xml", "xml", null);
		if (ra != null) {
			System.out.printf("文件组：%s，文件名：%s", ra[0], ra[1]);
		} else {
			System.out.println("上传失败");
		}
	}

}
