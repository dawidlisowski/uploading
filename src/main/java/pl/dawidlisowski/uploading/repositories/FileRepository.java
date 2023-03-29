package pl.dawidlisowski.uploading.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.dawidlisowski.uploading.entities.FileEntity;

public interface FileRepository extends CrudRepository<FileEntity, Integer> {
}
