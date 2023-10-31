package com.carrot.image;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;

@Controller
public class ImageUploadController {

    @GetMapping("/upload")
    public String showUploadForm() {
        return "uploadForm"; // 업로드 폼의 JSP 파일 이름
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
        if (!file.isEmpty()) {
            try {
                // 이미지를 저장할 경로 설정
                String uploadPath = "webapp/img"; // 실제 경로로 수정 필요
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdirs();
                }

                // 이미지 파일 저장
                File image = new File(uploadPath + file.getOriginalFilename());
                file.transferTo(image);

                redirectAttributes.addFlashAttribute("message", "이미지 업로드 성공!");
            } catch (IOException e) {
                e.printStackTrace();
                redirectAttributes.addFlashAttribute("message", "이미지 업로드 실패!");
            }
        } else {
            redirectAttributes.addFlashAttribute("message", "파일을 선택해주세요.");
        }

        return "redirect:/upload";
    }
}