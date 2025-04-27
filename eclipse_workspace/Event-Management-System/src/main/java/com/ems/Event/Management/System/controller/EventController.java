package com.ems.Event.Management.System.controller;

import com.ems.Event.Management.System.model.Event;
import com.ems.Event.Management.System.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    // ✅ Show Create Event Form (GET Request)
    @GetMapping("/create")
    public String showCreateEventForm(Model model) {
        model.addAttribute("event", new Event()); // send empty event object
        return "create_event"; // returns create_event.html
    }

    // ✅ Handle Create Event (POST Request)
    @PostMapping("/create")
    public String createEvent(@ModelAttribute Event event, RedirectAttributes redirectAttributes) {
        eventService.createEvent(event);
        redirectAttributes.addFlashAttribute("success", "Event created successfully!");
        return "redirect:/events/all";
    }

    // ✅ View All Events
    @GetMapping("/all")
    public String viewAllEvents(Model model) {
        List<Event> events = eventService.getAllEvents();
        model.addAttribute("events", events);
        return "event_list"; // event_list.html
    }

    // ✅ Show Update Event Form (GET)
    @GetMapping("/update/{id}")
    public String showUpdateEventForm(@PathVariable Long id, Model model) {
        Event event = eventService.getEventById(id);
        model.addAttribute("event", event);
        return "update_event"; // update_event.html
    }

    // ✅ Handle Update Event (POST Request)
    @PostMapping("/update")
    public String updateEvent(@ModelAttribute Event event, RedirectAttributes redirectAttributes) {
        eventService.createEvent(event); // saveOrUpdate automatically
        redirectAttributes.addFlashAttribute("success", "Event updated successfully!");
        return "redirect:/events/all";
    }

    // ✅ Handle Delete Event
    @GetMapping("/delete/{id}")
    public String deleteEvent(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        eventService.deleteEvent(id);
        redirectAttributes.addFlashAttribute("success", "Event deleted successfully!");
        return "redirect:/events/all";
    }
}
