package one.digitalinnovation.parking.service;

import one.digitalinnovation.parking.environments.EnvParking;
import one.digitalinnovation.parking.model.Parking;
import one.digitalinnovation.parking.repository.ParkingRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ParkingServiceTest {

    @InjectMocks
    public ParkingService parkingService;

    @Mock
    public ParkingRepository parkingRepository;

    @Test
    public void deveRetornarTodosOsCarrosEstacionados() {

        when(parkingRepository.findAll()).thenReturn(EnvParking.parkingList());

        assertTrue(parkingService.findAll().size() > 0);
    }

    @Test
    public void deveRetornarCarroEstacionadoPorId() {
        Optional<Parking> parking = Optional.of(new Parking());
        parking.get().setId("1");

        when(parkingRepository.findById("1")).thenReturn(parking);

        Optional.ofNullable(parkingService.findById("1"));

    }

}