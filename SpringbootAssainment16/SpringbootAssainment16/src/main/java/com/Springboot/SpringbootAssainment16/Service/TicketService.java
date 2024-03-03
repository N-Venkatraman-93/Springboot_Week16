package com.Springboot.SpringbootAssainment16.Service;

import java.util.List;

import com.Springboot.SpringbootAssainment16.Dto.TicketDto;



public interface TicketService {

  List<TicketDto> findAllTickets();

  void createTicket(TicketDto ticketDto);

  TicketDto findTicketById(Long ticketId);

  void updateTicket(TicketDto ticketDto);

  void deleteTicket(Long ticketId);

  TicketDto findTicketByUrl(String ticketUrl);

  List<TicketDto> searchTickets(String query);
}
