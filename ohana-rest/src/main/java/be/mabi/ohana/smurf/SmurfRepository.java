package be.mabi.ohana.smurf;

import org.springframework.data.jpa.repository.JpaRepository;

interface SmurfRepository extends JpaRepository<Smurf, Long> {
}
