package com.polsl.prir_proj.services;

import com.polsl.prir_proj.models.File;
import com.polsl.prir_proj.repositories.FileRepository;

import java.util.List;
import java.util.Optional;

public class FileService {
    private FileRepository fileRepository;

    public List<File> getAllFiles() {
        return this.fileRepository.findAll();
    }

    public void AddFile(File file){
        this.fileRepository.save(file);
    }

    public File getFileById(String id){
        Optional<File> file = this.fileRepository.findById(id);
        return file.orElse(null);
    }

    public void removeFile(String id){
        this.fileRepository.deleteById(id);
    }

}