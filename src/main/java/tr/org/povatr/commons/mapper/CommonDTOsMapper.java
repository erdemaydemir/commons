package tr.org.povatr.commons.mapper;

public interface CommonDTOsMapper<Entity, RequestDTO, ResponseDTO> {

    ResponseDTO mapToResponseDTO(Entity entity);

    Entity mapToEntity(RequestDTO requestDTO);
}