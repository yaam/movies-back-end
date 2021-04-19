package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table (name="Movie")
	public class Movie implements Serializable{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "movie_id")
		private int id;
		private String name;
		private String description;
		private String image;
		@Column(name="create_at")
		private LocalDateTime createAt;
		@Column(name="realease_date")
		private LocalDate realeaseDate;
		private String actors;
		@ManyToOne
		@JoinColumn(name = "gender_id")
		private Gender genderId;
		private int rating;
		
		public Movie() {
			
		}
		public Movie(int id, String name, String description, String image, LocalDateTime createAt,
				LocalDate realeaseDate, String actors, int rating,Gender gederId, Gender genderId ) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.image = image;
			this.createAt = createAt;
			this.realeaseDate = realeaseDate;
			this.actors = actors;
			this.rating = rating;
			this.genderId = genderId;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public LocalDateTime getCreateAt() {
			return createAt;
		}
		public void setCreateAt(LocalDateTime createAt) {
			this.createAt = createAt;
		}
		public LocalDate getRealeaseDate() {
			return realeaseDate;
		}
		public void setRealeaseDate(LocalDate realeaseDate) {
			this.realeaseDate = realeaseDate;
		}
		public String getActors() {
			return actors;
		}
		public void setActors(String actors) {
			this.actors = actors;
		}
		public Gender getGenderId() {
			return genderId;
		}
		public void setGenderId(Gender genderId) {
			this.genderId = genderId;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		
		
}
