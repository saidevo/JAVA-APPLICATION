
package com.ResourceManagement.files.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ResourceManagement.files.Enities.AddressOfResource;


@Repository
public interface AddressRepository  extends JpaRepository<AddressOfResource,Integer> {

}