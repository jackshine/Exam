package nwsuaf.com.exam.entity;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import nwsuaf.com.exam.entity.answer;
import nwsuaf.com.exam.entity.examdate;
import nwsuaf.com.exam.entity.lcerror;
import nwsuaf.com.exam.entity.lcproblem;
import nwsuaf.com.exam.entity.netmodel.FAnswer;
import nwsuaf.com.exam.entity.netmodel.netproblem;
import nwsuaf.com.exam.entity.Problems;

import nwsuaf.com.exam.entity.answerDao;
import nwsuaf.com.exam.entity.examdateDao;
import nwsuaf.com.exam.entity.lcerrorDao;
import nwsuaf.com.exam.entity.lcproblemDao;
import nwsuaf.com.exam.entity.netmodel.FAnswerDao;
import nwsuaf.com.exam.entity.netmodel.netproblemDao;
import nwsuaf.com.exam.entity.ProblemsDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig answerDaoConfig;
    private final DaoConfig examdateDaoConfig;
    private final DaoConfig lcerrorDaoConfig;
    private final DaoConfig lcproblemDaoConfig;
    private final DaoConfig fAnswerDaoConfig;
    private final DaoConfig netproblemDaoConfig;
    private final DaoConfig problemsDaoConfig;

    private final answerDao answerDao;
    private final examdateDao examdateDao;
    private final lcerrorDao lcerrorDao;
    private final lcproblemDao lcproblemDao;
    private final FAnswerDao fAnswerDao;
    private final netproblemDao netproblemDao;
    private final ProblemsDao problemsDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        answerDaoConfig = daoConfigMap.get(answerDao.class).clone();
        answerDaoConfig.initIdentityScope(type);

        examdateDaoConfig = daoConfigMap.get(examdateDao.class).clone();
        examdateDaoConfig.initIdentityScope(type);

        lcerrorDaoConfig = daoConfigMap.get(lcerrorDao.class).clone();
        lcerrorDaoConfig.initIdentityScope(type);

        lcproblemDaoConfig = daoConfigMap.get(lcproblemDao.class).clone();
        lcproblemDaoConfig.initIdentityScope(type);

        fAnswerDaoConfig = daoConfigMap.get(FAnswerDao.class).clone();
        fAnswerDaoConfig.initIdentityScope(type);

        netproblemDaoConfig = daoConfigMap.get(netproblemDao.class).clone();
        netproblemDaoConfig.initIdentityScope(type);

        problemsDaoConfig = daoConfigMap.get(ProblemsDao.class).clone();
        problemsDaoConfig.initIdentityScope(type);

        answerDao = new answerDao(answerDaoConfig, this);
        examdateDao = new examdateDao(examdateDaoConfig, this);
        lcerrorDao = new lcerrorDao(lcerrorDaoConfig, this);
        lcproblemDao = new lcproblemDao(lcproblemDaoConfig, this);
        fAnswerDao = new FAnswerDao(fAnswerDaoConfig, this);
        netproblemDao = new netproblemDao(netproblemDaoConfig, this);
        problemsDao = new ProblemsDao(problemsDaoConfig, this);

        registerDao(answer.class, answerDao);
        registerDao(examdate.class, examdateDao);
        registerDao(lcerror.class, lcerrorDao);
        registerDao(lcproblem.class, lcproblemDao);
        registerDao(FAnswer.class, fAnswerDao);
        registerDao(netproblem.class, netproblemDao);
        registerDao(Problems.class, problemsDao);
    }
    
    public void clear() {
        answerDaoConfig.clearIdentityScope();
        examdateDaoConfig.clearIdentityScope();
        lcerrorDaoConfig.clearIdentityScope();
        lcproblemDaoConfig.clearIdentityScope();
        fAnswerDaoConfig.clearIdentityScope();
        netproblemDaoConfig.clearIdentityScope();
        problemsDaoConfig.clearIdentityScope();
    }

    public answerDao getAnswerDao() {
        return answerDao;
    }

    public examdateDao getExamdateDao() {
        return examdateDao;
    }

    public lcerrorDao getLcerrorDao() {
        return lcerrorDao;
    }

    public lcproblemDao getLcproblemDao() {
        return lcproblemDao;
    }

    public FAnswerDao getFAnswerDao() {
        return fAnswerDao;
    }

    public netproblemDao getNetproblemDao() {
        return netproblemDao;
    }

    public ProblemsDao getProblemsDao() {
        return problemsDao;
    }

}
