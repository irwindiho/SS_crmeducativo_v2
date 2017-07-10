package com.consultoraestrategia.ss_crmeducativo.asistencia;

import android.support.design.widget.FloatingActionButton;

/**
 * Created by kelvi on 20/02/2017.
 */

public class AsistenciaInteractorImpl implements AsistenciaInteractor {

    private AsistenciaRepository asistenciaRepository;

    public AsistenciaInteractorImpl() {
        this.asistenciaRepository = new AsistenciaRepositoryImpl();
    }

    @Override
    public void onGetListaAlumnos() {
        asistenciaRepository.onGetListaAlumnos();
    }

    @Override
    public void onInitListView() {
        asistenciaRepository.onInitListView();
    }

    @Override
    public void changeStateFabButtons(FloatingActionButton btnCurrentState, FloatingActionButton btnAsistio, FloatingActionButton btnFalto, FloatingActionButton btnJustificado) {
        asistenciaRepository.changeStateFabButtons(btnCurrentState, btnAsistio, btnFalto, btnJustificado);
    }


}
