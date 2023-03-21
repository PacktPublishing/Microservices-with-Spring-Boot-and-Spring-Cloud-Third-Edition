package se.magnus.microservices.core.review;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import se.magnus.api.core.review.Review;
import se.magnus.microservices.core.review.persistence.ReviewEntity;
import se.magnus.microservices.core.review.services.ReviewMapper;


class MapperTests {

  private ReviewMapper mapper = Mappers.getMapper(ReviewMapper.class);

  @Test
  void mapperTests() {

    assertNotNull(mapper);

    Review api = new Review(1, 2, "a", "s", "C", "adr");

    ReviewEntity entity = mapper.apiToEntity(api);

    assertEquals(api.getProductId(), entity.getProductId());
    assertEquals(api.getReviewId(), entity.getReviewId());
    assertEquals(api.getAuthor(), entity.getAuthor());
    assertEquals(api.getSubject(), entity.getSubject());
    assertEquals(api.getContent(), entity.getContent());

    Review api2 = mapper.entityToApi(entity);

    assertEquals(api.getProductId(), api2.getProductId());
    assertEquals(api.getReviewId(), api2.getReviewId());
    assertEquals(api.getAuthor(), api2.getAuthor());
    assertEquals(api.getSubject(), api2.getSubject());
    assertEquals(api.getContent(), api2.getContent());
    assertNull(api2.getServiceAddress());
  }

  @Test
  void mapperListTests() {

    assertNotNull(mapper);

    Review api = new Review(1, 2, "a", "s", "C", "adr");
    List<Review> apiList = Collections.singletonList(api);

    List<ReviewEntity> entityList = mapper.apiListToEntityList(apiList);
    assertEquals(apiList.size(), entityList.size());

    ReviewEntity entity = entityList.get(0);

    assertEquals(api.getProductId(), entity.getProductId());
    assertEquals(api.getReviewId(), entity.getReviewId());
    assertEquals(api.getAuthor(), entity.getAuthor());
    assertEquals(api.getSubject(), entity.getSubject());
    assertEquals(api.getContent(), entity.getContent());

    List<Review> api2List = mapper.entityListToApiList(entityList);
    assertEquals(apiList.size(), api2List.size());

    Review api2 = api2List.get(0);

    assertEquals(api.getProductId(), api2.getProductId());
    assertEquals(api.getReviewId(), api2.getReviewId());
    assertEquals(api.getAuthor(), api2.getAuthor());
    assertEquals(api.getSubject(), api2.getSubject());
    assertEquals(api.getContent(), api2.getContent());
    assertNull(api2.getServiceAddress());
  }
}
