package com.example.QRCodeGenerator.controller;

import com.example.QRCodeGenerator.module.QRCodeGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QRController {
    private static final String QR_CODE_IMAGE_PATH = "./src/main/resources/QRCode.png";

    @GetMapping("/generateAndDownloadQRCode/{codeText}/{width}/{height}")
    public void download(@PathVariable("codeText") String codeText, @PathVariable("width") Integer width, @PathVariable("height") Integer height)
        throws Exception{
        QRCodeGenerator.generateQRCodeImage(codeText,width,height,QR_CODE_IMAGE_PATH);
    }

    @GetMapping("/generateQRCode/{codeText}/{width}/{height}")
    public ResponseEntity<byte[]> generateQRCode(
            @PathVariable("codeText") String codeText,
            @PathVariable("width") Integer width,
            @PathVariable("height") Integer height
    ) throws Exception{
        return ResponseEntity.status(HttpStatus.OK).body(QRCodeGenerator.getQRCodeImage(codeText,height,width));
    }



}
