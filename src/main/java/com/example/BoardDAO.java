package com.example.dao;

import com.example.bean.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {
    @Autowired
    SqlSession sqlSession;

    public int insertBoard(BoardVO vo){
        int result = sqlSession.insert("Board.insertBoard",vo);
        return result;
    }

    public BoardVO getBoard(int seq){
        BoardVO one = sqlSession.selectOne("Board.getBoard", seq);
        return one;
    }

    public List<BoardVO> getBoardList(){
        List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
        return list;
    }
//    public int updateBoard(BoardVO vo){
//        int result = sqlSession.update("Board.updateBoard",vo);
//        return result;
//    }

//    public deleteBoard(BoardVO vo){
//        int result = sqlSession.delete("Board.deleteBoard",vo);
//        return result;
//    }

//    public int selectOneBoard(BoardVO vo){
//        int result = sqlSession.selectOne("Board.selectBoard",vo);
//        return result;
//    }
//
//    public int selectListBoard(BoardVO vo){
//        int result = sqlSession.selectList("Board.selectListBoard",vo);
//        return result;
//    }
}
