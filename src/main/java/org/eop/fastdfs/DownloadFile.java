package org.eop.fastdfs;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;

/**
 * @author lixinjie
 * @since 
 */
public class DownloadFile {
	public static void main(String[] args) throws Exception {
		ClientGlobal.init("fdfs_client.conf");
		StorageClient1 sc = new StorageClient1();
		int rc = sc.download_file("group1", "M00/00/00/wKhfNFkGHV-AYDT8AAADAg4zzmQ164.xml", "R:\\pom.xml");
		if (rc == 0) {
			System.out.println("下载成功");
		} else {
			System.out.println(rc);
		}
	}
}
