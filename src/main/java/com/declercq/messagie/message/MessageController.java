package com.declercq.messagie.message;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MessageController {

    private ArrayList<Message> list = new ArrayList<>();

    @Autowired
    private MessageService messageService;

//    @GetMapping("/get-message")
//    public Message getMessage(@RequestParam(value = "id") int id) {
//        return messageService.findById(id);
//    }

    @PostMapping("/saveMessage")
    public void saveMessage(@RequestBody Message message) {
        System.out.println("/saveMessage : " + message.getMessage() + " : " + message.getPseudo());
        list.add(message);
    }

    @Operation(
            summary = "Obtenir les derniers messages",
            description = "Récupère les 10 derniers messages enregistrés dans le tchat"
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Liste des messages retournée avec succès",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Message.class)
                    )
            )
    })
    @GetMapping("/allMessages")
    public ArrayList<Message> allMessages() {
        System.out.println("/allMessages");

        //pour ne retourner que les 10 derniers
        ArrayList<Message> toReturn = new ArrayList<>();
        for (int i = Math.max(list.size() - 10, 0); i < list.size(); i++) {
            toReturn.add(list.get(i));
        }

        return toReturn;
    }
}
