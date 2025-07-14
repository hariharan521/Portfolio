package in.hariharan.Portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hariharan.Portfolio.model.Contact;

// This interface gives access to save, findAll, delete, etc.
public interface ContactRepository extends JpaRepository<Contact,Long>{
}