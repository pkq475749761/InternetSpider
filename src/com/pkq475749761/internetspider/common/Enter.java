package com.pkq475749761.internetspider.common;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class Enter {
	public static void main(String[] args) {
		HttpClientBuilder builder = HttpClientBuilder.create();
		CloseableHttpClient client = builder.build();
		HttpUriRequest req = new HttpGet("http://www.wangtouwang.com");
		
		try {
			CloseableHttpResponse resp = client.execute(req);
			HttpEntity entity = resp.getEntity();
			System.out.println(EntityUtils.toString(entity));
		} catch (IOException e) {
			System.out.println("");
			e.printStackTrace();
		}finally {
			try {
				client.close();
			} catch (IOException e) {
				System.out.println("client�ر�ʧ��");
				e.printStackTrace();
			}
		}
	}
}
