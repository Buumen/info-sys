package hu.scs.enaplo.service;

import java.util.List;

import hu.scs.enaplo.model.archive.Archive;
import hu.scs.enaplo.model.archive.ArchiveReport;

/**
 * This interface contains all related function definitions to the admin.
 */
public interface AdminService {

    /**
     * When the school year ends, the admin able to update the
     * entire database for new year and clear out the previous data.
     * +!+ WARNING +!+ THIS FUNCTION DOESN'T CREATE ANY BACKUP. +!+ WARNING +!+
     */
    void newYear();

    /**
     * Creates an archive file, that contains all student reports.
     *
     */
    String createArchive();

    /**
     * Returns a List of Archive Report.
     *
     * @return a list of archive report.
     */
    List<Archive> getArchive();

    /**
     * Returns an Archive by student id.
     *
     * @param id Id of the archive;
     * @return a list of archive report.
     */
    Archive getArchiveById(Long id);

    /**
     * If, the class finished the school, this function delete the class
     * and also all student from the class.
     *
     * @param classroom_id Id of the classroom.
     */
    void finished(Long classroom_id);
}
