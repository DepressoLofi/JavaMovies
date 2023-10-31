package davi.lofi.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection= "movies")
@Data
@AllArgsConstructor
public class Movie {

    @Id
    private ObjectId id;
    private String imdbid;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;

    private List<String> genre;

    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewId;

}
