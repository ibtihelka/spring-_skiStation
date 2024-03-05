package com.example.stationski.Services;

import com.example.stationski.Entity.Piste;

import java.util.List;

public interface IPisteService {
    Piste addpiste ( Piste p);

    Piste updatepiste (Piste p);
    List<Piste> getAll ();
    Piste getById (Long id);
    Boolean DeleteById (Long id);
}
