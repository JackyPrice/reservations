package com.jackyprice.landon.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.jackyprice.landon.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}