package com.example.AddressBookApp.interfaces;

import com.example.AddressBookApp.DTO.AddressDTO;
import com.example.AddressBookApp.model.Address;
import java.util.List;
import java.util.Optional;

public interface AddressService {
    List<Address> getAllAddresses();
    Optional<Address> getAddressById(Long id);
    Address createAddress(AddressDTO addressDTO);
    Address updateAddress(Long id, AddressDTO addressDTO);
    void deleteAddress(Long id);
}
