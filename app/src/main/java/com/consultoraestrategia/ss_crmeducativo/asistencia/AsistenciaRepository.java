package com.consultoraestrategia.ss_crmeducativo.asistencia;

import android.support.design.widget.FloatingActionButton;

/**
 * Created by kelvi on 21/02/2017.
 */

public interface AsistenciaRepository {
    void onGetListaAlumnos();
    void onInitListView();
    void changeStateFabButtons(FloatingActionButton btnCurrentState, FloatingActionButton btnAsistio, FloatingActionButton btnFalto, FloatingActionButton btnJustificado);
}
