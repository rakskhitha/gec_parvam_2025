package com.ems.Event.Management.System.service;



import com.ems.Event.Management.System.model.Event;
import com.ems.Event.Management.System.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public List<Event> getEventsByOrganizer(Long organizerId) {
        return eventRepository.findByCreatedBy(organizerId);
    }
    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
    public long getEventCount() {
        return eventRepository.count();
    }


}
