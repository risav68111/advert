package lms.app.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lms.app.course.entity.ModuleEntity;
import lms.app.course.repository.ModuleRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ModulesService {

    private ModuleRepository moduleRepository; 

    public List<ModuleEntity> allModules() {
        return moduleRepository.findAll();
    }

    // public
}
