package com.ly.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Liuying on 2018/11/1.
 */
@RestController
@RequestMapping(value = "springboot")
public class uploadFile
{
    @RequestMapping(value = "uploadFile",method= RequestMethod.POST)
    public Map uploadFile(MultipartFile file) throws IOException {
        Map map = new HashMap();
        String fileName = file.getOriginalFilename();
        String fileType = fileName.substring(fileName.indexOf(".")+1);
        File fileDir = new File("temp");
        if(!fileDir.exists()){
            fileDir.mkdir();
        }
        String path = fileDir.getAbsolutePath();
        file.transferTo(new File(fileDir.getAbsolutePath(),fileName));
        Map<String,String> result = new HashMap<String,String>();
        result.put("name",fileName);
        result.put("size",String.valueOf(file.getSize()));
        map.put("data",result);
        map.put("status",200);
        map.put("timetamp",String.valueOf(System.currentTimeMillis()));

        return map;
    }

    @RequestMapping(value="mulFileUpload",method=RequestMethod.POST)
    public Map multiFileUpload (MultipartFile[] files){
        StringBuilder builder = new StringBuilder();
        Map map = new HashMap();
        for(MultipartFile file:files){
            String fileName = file.getOriginalFilename();
            String fileType = fileName.substring(fileName.indexOf(".")+1);
            File fileDir = new File("tmp");
            if(!fileDir.exists()){
                fileDir.mkdir();
            }
            String path = fileDir.getAbsolutePath();
            try {
                file.transferTo(new File(path,fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            builder.append(fileName).append(",");
            if(builder.length()>1){
                builder= builder.deleteCharAt(builder.length()-1);
            }
            map.put("data",builder.toString());
            map.put("status",200);
            map.put("timetamp",String.valueOf(System.currentTimeMillis()));

        }
        return map;
    }

    @RequestMapping(value = "downFile",method=RequestMethod.GET)
    public void downFileFromServer(HttpServletResponse response){
        String fileName = "";
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition","attachment;filename="+fileName);
        byte[] buff = new byte[1024];
        BufferedInputStream bis = null;
        OutputStream os = null;
        try {
            os= response.getOutputStream();
            bis = new BufferedInputStream(new FileInputStream(new File ("temp",fileName)));
            int i = bis.read(buff);
            while(i!=-1){

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
