package org.medicare.services;

import java.util.List;

import org.medicare.entity.Medicines;

public interface MedicineService {
	void insertMedicines(Medicines medicines);
	void updateMedicines(Medicines medicines);
	void deleteMedicines(int medicineId);
	Medicines findById(int medicineId);
	List<Medicines>getMedicineDetails();
}
