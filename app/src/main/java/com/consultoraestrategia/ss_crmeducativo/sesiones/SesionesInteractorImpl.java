package com.consultoraestrategia.ss_crmeducativo.sesiones;

/**
 * Created by kelvi on 06/03/2017.
 */

public class SesionesInteractorImpl implements SesionesInteractor {

    private SesionesRepository sesionesRepository;

    public SesionesInteractorImpl() {
        this.sesionesRepository = new SesionesRepositoryImpl();
    }

    @Override
    public void onSetupRecycler() {
        sesionesRepository.onSetupRecycler();
    }

    @Override
    public void onLoadSpinnerTrimestre() {
        sesionesRepository.onLoadSpinnerTrimestre();
    }

    @Override
    public void onLoadSpinnerUnidad() {
        sesionesRepository.onLoadSpinnerUnidad();
    }


}
